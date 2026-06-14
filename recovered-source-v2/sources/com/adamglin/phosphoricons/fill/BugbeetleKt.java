package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bugbeetle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BugBeetle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBugBeetle", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bugBeetle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BugbeetleKt {
    private static ImageVector _bugBeetle;

    public static final ImageVector getBugBeetle(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bugBeetle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BugBeetle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 120.0f);
        pathBuilder.lineTo(208.0f, 120.0f);
        pathBuilder.lineTo(208.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(48.0f, 120.0f);
        pathBuilder.lineTo(48.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 160.0f);
        pathBuilder.curveToRelative(0.0f, 2.7f, -0.14f, 5.37f, -0.4f, 8.0f);
        pathBuilder.lineTo(224.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(204.32f, 184.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, -152.64f, 0.0f);
        pathBuilder.lineTo(32.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(48.4f, 168.0f);
        pathBuilder.curveToRelative(-0.26f, -2.63f, -0.4f, -5.3f, -0.4f, -8.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.lineTo(32.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(48.0f, 136.0f);
        pathBuilder.lineTo(48.0f, 120.0f);
        pathBuilder.lineTo(208.0f, 120.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(69.84f, 57.15f);
        pathBuilder.arcTo(79.76f, 79.76f, 0.0f, false, false, 48.4f, 104.0f);
        pathBuilder.lineTo(207.6f, 104.0f);
        pathBuilder.arcToRelative(79.76f, 79.76f, 0.0f, false, false, -21.44f, -46.85f);
        pathBuilder.lineToRelative(19.5f, -19.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder.lineToRelative(-20.29f, 20.3f);
        pathBuilder.arcToRelative(79.74f, 79.74f, 0.0f, false, false, -92.1f, 0.0f);
        pathBuilder.lineTo(61.66f, 26.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 50.34f, 37.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bugBeetle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
