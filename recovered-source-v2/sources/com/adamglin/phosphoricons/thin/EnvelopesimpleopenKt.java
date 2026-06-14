package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Envelopesimpleopen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EnvelopeSimpleOpen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEnvelopeSimpleOpen", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_envelopeSimpleOpen", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvelopesimpleopenKt {
    private static ImageVector _envelopeSimpleOpen;

    public static final ImageVector getEnvelopeSimpleOpen(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _envelopeSimpleOpen;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EnvelopeSimpleOpen", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.22f, 92.67f);
        pathBuilder.lineToRelative(-96.0f, -64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.44f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 96.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 226.22f, 92.67f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.81f);
        pathBuilder.lineTo(217.0f, 96.11f);
        pathBuilder.lineTo(144.17f, 148.0f);
        pathBuilder.horizontalLineTo(111.83f);
        pathBuilder.lineTo(39.05f, 96.11f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 204.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(103.76f);
        pathBuilder.lineToRelative(72.22f, 51.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.33f, 0.74f);
        pathBuilder.horizontalLineToRelative(34.9f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.33f, -0.74f);
        pathBuilder.lineTo(220.0f, 103.76f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _envelopeSimpleOpen = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
