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

/* compiled from: Speakersimplenone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpeakerSimpleNone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSpeakerSimpleNone", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speakerSimpleNone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeakersimplenoneKt {
    private static ImageVector _speakerSimpleNone;

    public static final ImageVector getSpeakerSimpleNone(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _speakerSimpleNone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpeakerSimpleNone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(161.76f, 28.41f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.22f, 0.43f);
        pathBuilder.lineTo(86.63f, 84.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(86.63f);
        pathBuilder.lineToRelative(70.91f, 55.16f);
        pathBuilder.arcTo(4.07f, 4.07f, 0.0f, false, false, 160.0f, 228.0f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.76f, -0.41f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 224.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 161.76f, 28.41f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 215.82f);
        pathBuilder.lineToRelative(-65.54f, -51.0f);
        pathBuilder.arcTo(4.06f, 4.06f, 0.0f, false, false, 88.0f, 164.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(4.06f, 4.06f, 0.0f, false, false, 2.46f, -0.84f);
        pathBuilder.lineToRelative(65.54f, -51.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speakerSimpleNone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
